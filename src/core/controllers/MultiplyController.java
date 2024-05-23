package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Multiply;
import core.models.Operation;
import core.models.storage.History;
import java.text.DecimalFormat;

public class MultiplyController {

    public static Response createOperation(String number1, String number2) {

        DecimalFormat formatter = new DecimalFormat(".###");

        try {
            double n1, n2;

            if (number1.equals("")) {
                return new Response("Number 1 must be not empty", Status.BAD_REQUEST);
            }

            if (number2.equals("")) {
                return new Response("Number 2 must be not empty", Status.BAD_REQUEST);
            }

            try {
                n1 = Double.parseDouble(number1);
            } catch (NumberFormatException e) {
                return new Response("Number 1 must be numeric", Status.BAD_REQUEST);
            }

            try {
                n2 = Double.parseDouble(number2);
            } catch (NumberFormatException e) {
                return new Response("Number 2 must be numeric", Status.BAD_REQUEST);
            }

            String a[] = number1.split("\\.");
            if (a.length > 1) {

                if (a[1].length() > 3) {
                    return new Response("Number 1 must have at most 3 decimals", Status.BAD_REQUEST);
                }
            }

            String b[] = number2.split("\\.");

            if (b.length > 1) {
                if (b[1].length() > 3) {
                    return new Response("Number 2 must have at most 3 decimals", Status.BAD_REQUEST);
                }
            }

            History history = History.getInstance();
            Operation op = new Multiply(n1, n2);
            String result = formatter.format(op.getResult());

            history.addOperation(op);

            return new Response("Operated Succesfully", Status.OK, result.replace(",","."));

        } catch (Exception e) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
