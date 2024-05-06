package sg.edu.np.mad.madpractical4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView imageViewSmall, imageViewLarge;
    TextView name, description, txt; // Define the txt variable

    public UserViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.description);
        imageViewSmall = itemView.findViewById(R.id.smallRobot);
        imageViewLarge = itemView.findViewById(R.id.smallBg);
        txt = itemView.findViewById(android.R.id.text1);
    }
}
