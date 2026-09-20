package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.CQf;
import androidx.work.QnHx;
import androidx.work.impl.model.WorkSpec;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzcgn;
import defpackage.co2;
import defpackage.dv2;
import defpackage.h70;
import defpackage.nn5;
import defpackage.om;
import defpackage.on5;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class WorkManagerUtil extends zzbq {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final void zze(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        try {
            nn5.X0(context.getApplicationContext(), new QnHx(new QnHx.C0032QnHx()));
        } catch (IllegalStateException unused) {
        }
        try {
            nn5 nn5VarW0 = nn5.W0(context);
            nn5VarW0.getClass();
            ((on5) nn5VarW0.z).a(new om(nn5VarW0));
            h70.QnHx qnHx = new h70.QnHx();
            qnHx.a = co2.CONNECTED;
            h70 h70Var = new h70(qnHx);
            dv2.QnHx qnHx2 = new dv2.QnHx(OfflinePingSender.class);
            qnHx2.b.j = h70Var;
            qnHx2.c.add("offline_ping_sender_work");
            nn5VarW0.V0(Collections.singletonList(qnHx2.a()));
        } catch (IllegalStateException e) {
            zzcgn.zzk("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbr
    public final boolean zzf(IObjectWrapper iObjectWrapper, String str, String str2) throws Throwable {
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        try {
            nn5.X0(context.getApplicationContext(), new QnHx(new QnHx.C0032QnHx()));
        } catch (IllegalStateException unused) {
        }
        h70.QnHx qnHx = new h70.QnHx();
        qnHx.a = co2.CONNECTED;
        h70 h70Var = new h70(qnHx);
        HashMap map = new HashMap();
        map.put("uri", str);
        map.put("gws_query_id", str2);
        CQf cQf = new CQf(map);
        CQf.b(cQf);
        dv2.QnHx qnHx2 = new dv2.QnHx(OfflineNotificationPoster.class);
        WorkSpec workSpec = qnHx2.b;
        workSpec.j = h70Var;
        workSpec.e = cQf;
        qnHx2.c.add("offline_notification_work");
        dv2 dv2VarA = qnHx2.a();
        try {
            nn5 nn5VarW0 = nn5.W0(context);
            nn5VarW0.getClass();
            nn5VarW0.V0(Collections.singletonList(dv2VarA));
            return true;
        } catch (IllegalStateException e) {
            zzcgn.zzk("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
