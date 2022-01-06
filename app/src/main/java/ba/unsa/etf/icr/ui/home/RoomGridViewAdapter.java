package ba.unsa.etf.icr.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import ba.unsa.etf.icr.R;
import ba.unsa.etf.icr.util.Appliance;
import ba.unsa.etf.icr.util.Room;


public class RoomGridViewAdapter extends BaseAdapter {
    static class ViewHolder {
        ImageButton holdButton;
    }

    public static Room room;

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Appliance getItem(int position) {
        return room.getAppliances().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View result;
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.appliance_layout, parent, false);
            holder = new ViewHolder();

            holder.holdButton = (ImageButton) convertView.findViewById(R.id.applianceButton);

            result = convertView;
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        holder.holdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(), "Button " + position, Toast.LENGTH_LONG).show();
            }
        });

        return convertView;
    }
}
