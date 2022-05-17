package com.example.recycleview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.val_ViewHolder> {

    ArrayList<C_Agents> cAgentsArrayList;
    //list mn l objects
    Context context;
    public CustomAdapter(Context context1,ArrayList<C_Agents>valos1){
        this.cAgentsArrayList =valos1;
        this.context=context1;
    }
    //adabter bya5od l context wl data l hy3rdha

    @NonNull
    @Override
    public val_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout,null,false);
        return new val_ViewHolder(view);
    }
    //oncreate viewholder b3ml fiih inflate
    class val_ViewHolder extends RecyclerView.ViewHolder{
        TextView textView,caption,caption2;
        ImageView imageView;
        CircleImageView profileimage;
        ImageButton imgButton1;
        ImageButton imgButton2;
        ImageButton imgButton3;
        ImageButton imgButton4;
        public val_ViewHolder(View itemview){
            super(itemview);
            textView =itemview.findViewById(R.id.textViewId);
            imageView=itemview.findViewById(R.id.imageID);
            profileimage=itemview.findViewById(R.id.profile);
            caption=itemview.findViewById(R.id.caption);
            caption2=itemview.findViewById(R.id.caption2);
            imgButton1=itemview.findViewById(R.id.likeButton);
            imgButton2=itemview.findViewById(R.id.cmntButton);
            imgButton3=itemview.findViewById(R.id.shareButton);
            imgButton4=itemview.findViewById(R.id.infoButton);
        }
    }
    @Override
    public void onBindViewHolder(@NonNull val_ViewHolder holder, int position) {
    C_Agents agent1 = cAgentsArrayList.get(position);
    holder.imageView.setImageResource(agent1.getTimeline_image());
    holder.textView.setText(agent1.getName());
    holder.profileimage.setImageResource(agent1.getProfile_image());
    holder.caption.setText(agent1.getCaption());
    holder.caption2.setText(agent1.getName());
    }
    //fl onbind bgeeb eldata bta3ty mn l class w brbotha bl data f class l view holder 
    @Override
    public int getItemCount() {
        return cAgentsArrayList.size();
    }


}
