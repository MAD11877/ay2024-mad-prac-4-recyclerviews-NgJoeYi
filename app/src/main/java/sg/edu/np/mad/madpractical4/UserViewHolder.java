package sg.edu.np.mad.madpractical4;

import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ImageView smallImage, bigImage;

    TextView name;

    TextView description;

    public UserViewHolder(View itemView){
        super(itemView);
        //location of the xml (the ids)
        bigImage = itemView.findViewById(R.id.bigImage);
        smallImage = itemView.findViewById(R.id.profilePic);
        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.description);
    }

}
