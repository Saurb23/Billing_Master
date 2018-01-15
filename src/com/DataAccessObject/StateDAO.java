/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DataAccessObject;

import com.database.utility.DBAccessUtility;
import com.model.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author W10
 */
public class StateDAO {
    ResultSet rs=null;
       
    public List<State> getListofStates(){
        List<State> stateList= new ArrayList<>();
        String stmt="select statename,statecode,tin from state";
        
        try {
            rs=DBAccessUtility.dbExecuteQuery(stmt);
            while(rs.next()){
                State state= new State();
                state.setStateName(rs.getString("statename"));
                state.setStateCode(rs.getString("statecode"));
                state.setTIN(rs.getString("tin"));
                stateList.add(state);
            }
        } catch (SQLException|ClassNotFoundException ex) {
            Logger.getLogger(StateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
                    try {
                        if (rs != null) {
                    rs.close();
                }
                       DBAccessUtility.dbDisconnect();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return stateList;
    }
    
    
    public State getStateCode(String stateName){
        State state= new State();
        String stmt="select id, statecode,tin from state where statename='"+stateName+"'";
        try {
            rs=DBAccessUtility.dbExecuteQuery(stmt);
             while(rs.next()){
            state.setId(rs.getLong("id"));
            state.setStateCode(rs.getString("statecode"));
            state.setTIN("tin");
        }
        } catch (SQLException ex) {
            Logger.getLogger(StateDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StateDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return state;
    }
}
