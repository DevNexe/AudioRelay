package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j15 implements Iterable<Intent> {
    public final ArrayList<Intent> w = new ArrayList<>();
    public final Context x;

    public static class QnHx {
        public static PendingIntent a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
            return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
        }
    }

    public j15(Context context) {
        this.x = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.x;
        ArrayList<Intent> arrayList = this.w;
        int size = arrayList.size();
        try {
            for (Intent intentA = wl2.a(context, componentName); intentA != null; intentA = wl2.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public final void b() {
        ArrayList<Intent> arrayList = this.w;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = r80.a;
        r80.QnHx.a(this.x, intentArr, null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.w.iterator();
    }
}
