package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import defpackage.ie5;
import defpackage.j4;
import defpackage.ke3;
import defpackage.ne5;
import defpackage.ua5;
import defpackage.ya5;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        ya5.b(context);
        j4.QnHx qnHxA = ua5.a();
        qnHxA.b(queryParameter);
        qnHxA.c(ke3.b(iIntValue));
        if (queryParameter2 != null) {
            qnHxA.b = Base64.decode(queryParameter2, 0);
        }
        ne5 ne5Var = ya5.a().d;
        j4 j4VarA = qnHxA.a();
        Runnable runnable = new Runnable() { // from class: wK
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = AlarmManagerSchedulerBroadcastReceiver.a;
            }
        };
        ne5Var.getClass();
        ne5Var.e.execute(new ie5(ne5Var, j4VarA, i, runnable));
    }
}
