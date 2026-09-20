package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.dv2;
import defpackage.nn5;
import defpackage.s52;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = s52.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String str = a;
        s52.c().a(str, "Requesting diagnostics", new Throwable[0]);
        try {
            nn5 nn5VarW0 = nn5.W0(context);
            dv2 dv2VarA = new dv2.QnHx(DiagnosticsWorker.class).a();
            nn5VarW0.getClass();
            nn5VarW0.V0(Collections.singletonList(dv2VarA));
        } catch (IllegalStateException e) {
            s52.c().b(str, "WorkManager is not initialized", e);
        }
    }
}
