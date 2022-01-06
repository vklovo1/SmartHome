package ba.unsa.etf.icr.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ba.unsa.etf.icr.util.Appliance;
import ba.unsa.etf.icr.util.House;
import ba.unsa.etf.icr.util.Room;
import ba.unsa.etf.icr.R;

public class HomeGridViewAdapter extends BaseAdapter {
    static class ViewHolder {
        TextView holdRoomNameTextView;
        GridView holdRoomGridView;
    }

    private House house = House.getInstance();

    @Override
    public int getCount() {
        return house.getRooms().size();
    }

    @Override
    public Room getItem(int position) {
        return house.getRooms().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String roomName = getItem(position).getName();


        final View result;
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            convertView = inflater.inflate(R.layout.room_layout, parent, false);
            holder = new ViewHolder();

            holder.holdRoomGridView = (GridView) convertView.findViewById(R.id.roomGridView);
            holder.holdRoomNameTextView = (TextView) convertView.findViewById(R.id.roomNameTextView);

            result = convertView;
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }

        //Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);
        //result.startAnimation(animation);
        //lastPosition = position;

        holder.holdRoomNameTextView.setText(roomName);
        RoomGridViewAdapter mAdapter = new RoomGridViewAdapter();
        holder.holdRoomGridView.setAdapter(mAdapter);
        return convertView;
    }
}