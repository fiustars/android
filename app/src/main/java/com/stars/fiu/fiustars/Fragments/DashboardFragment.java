package com.stars.fiu.fiustars.Fragments;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.stars.fiu.fiustars.R;
import com.stars.fiu.fiustars.Utilities.ServiceHandler;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by ashleynarcisse on 5/8/14.
 */
public class DashboardFragment extends Fragment {

    public DashboardFragment() {}
    private final String API_REFERRAL = "https://en.neurs.com/api/referrals";
    private final String API_USER = "https://en.neurs.com/api/user";
    private JSONObject json;
    private GridView grid;
    private String img;
    private View view;
    private ProgressDialog pDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    private class FetchData extends AsyncTask<Void, Void, Void>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = ProgressDialog.show(getActivity(), getString(R.string.modal_loading_info), getString(R.string.modal_loading_info), true);
        }

        @Override
        protected Void doInBackground(Void... voids){
            return null;
        }

//        @Override
//        protected void onProgressUpdate(DashboardItem... item) {
//            gridAdapter.add(item[0]);
//            gridAdapter.notifyDataSetChanged();
//        }

        @Override
        protected void onPostExecute(Void result){
            super.onPostExecute(result);


            if (pDialog.isShowing())
                pDialog.dismiss();
        }
    }
}
