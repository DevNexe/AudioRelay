package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.azefsw.audioconnect.root.ui.RootActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h03 implements g03 {
    public final Context a;

    public h03(Context context) {
        this.a = context;
    }

    @Override // defpackage.g03
    public final PendingIntent a() {
        return c("server");
    }

    @Override // defpackage.g03
    public final PendingIntent b() {
        return c("player");
    }

    public final PendingIntent c(String str) {
        Uri uri = Uri.parse(iv4.v("https://audiorelay.net/deeplink/main/{destinationId}", "{destinationId}", str));
        Context context = this.a;
        Intent intent = new Intent("android.intent.action.VIEW", uri, context, RootActivity.class);
        ArrayList arrayList = new ArrayList();
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(context.getPackageManager());
        }
        if (component != null) {
            int size = arrayList.size();
            try {
                for (Intent intentA = wl2.a(context, component); intentA != null; intentA = wl2.a(context, intentA.getComponent())) {
                    arrayList.add(size, intentA);
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e);
            }
        }
        arrayList.add(intent);
        int i = Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return j15.QnHx.a(context, 0, intentArr, i, null);
    }
}
