package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.ads.internal.util.zzcg;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e86 extends BroadcastReceiver {
    public final /* synthetic */ zzcg a;

    public e86(zzcg zzcgVar) {
        this.a = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzcg zzcgVar = this.a;
        synchronized (zzcgVar) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : zzcgVar.b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
            }
        }
    }
}
