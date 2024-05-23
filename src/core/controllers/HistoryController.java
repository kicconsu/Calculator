package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Operation;
import core.models.storage.History;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;


public class HistoryController {

    public static Response getHistory(){
    
        try{
        //Fetch History singleton
        History hist = History.getInstance();
        
        //Fetch data stored inside History
        ArrayList<Operation> operationHist = hist.getOperations();
        
        //Validate if its empty
        if(operationHist.isEmpty()){
            return new Response("Empty operation history.", Status.NOT_FOUND);
        }
        
        //Instance Model that is to be displayed in the View
        Collections.reverse(operationHist);
        DefaultListModel operationModel = new DefaultListModel();
        operationModel.addAll(operationHist);
        return new Response("History found.", Status.OK, operationModel);
        
        } catch(Exception ex){
            return new Response("Unexpected error!", Status.INTERNAL_SERVER_ERROR);
        }
        
    }
    
}
