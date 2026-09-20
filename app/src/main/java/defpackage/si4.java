package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.azefsw.audioconnect.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class si4 extends cx1 implements h81<sd5> {
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si4(Context context) {
        super(0);
        this.w = context;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        Context context = this.w;
        a62.a.e("clicked on 'get link'");
        try {
            ComponentActivity componentActivityX = FWT.x(context);
            if (componentActivityX != null) {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.addFlags(524288);
                intent.putExtra("android.intent.extra.SUBJECT", componentActivityX.getString(R.string.setup_card_download_link_intent_subject));
                intent.putExtra("android.intent.extra.TEXT", "https://audiorelay.net");
                Intent intentCreateChooser = Intent.createChooser(intent, String.format(componentActivityX.getString(R.string.setup_card_download_link_share_title), Arrays.copyOf(new Object[]{"https://audiorelay.net"}, 1)));
                Object obj = r80.a;
                r80.QnHx.b(componentActivityX, intentCreateChooser, null);
            }
        } catch (ActivityNotFoundException e) {
            a62 a62Var = a62.a;
            a62.a.d(e, true);
        }
        return sd5.a;
    }
}
