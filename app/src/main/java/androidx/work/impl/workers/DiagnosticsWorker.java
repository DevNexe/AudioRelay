package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.QnHx;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import defpackage.AY;
import defpackage.at3;
import defpackage.bo5;
import defpackage.ct3;
import defpackage.gz4;
import defpackage.h70;
import defpackage.hz4;
import defpackage.nn5;
import defpackage.pn5;
import defpackage.qn5;
import defpackage.s52;
import defpackage.yn5;
import defpackage.zn5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String C = s52.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(pn5 pn5Var, yn5 yn5Var, gz4 gz4Var, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WorkSpec workSpec = (WorkSpec) it.next();
            SystemIdInfo systemIdInfoA = ((hz4) gz4Var).a(workSpec.a);
            Integer numValueOf = systemIdInfoA != null ? Integer.valueOf(systemIdInfoA.b) : null;
            String str = workSpec.a;
            qn5 qn5Var = (qn5) pn5Var;
            qn5Var.getClass();
            ct3 ct3VarE = ct3.e(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                ct3VarE.g(1);
            } else {
                ct3VarE.h(1, str);
            }
            at3 at3Var = qn5Var.a;
            at3Var.b();
            Cursor cursorG = at3Var.g(ct3VarE);
            try {
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList2.add(cursorG.getString(0));
                }
                cursorG.close();
                ct3VarE.i();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", workSpec.a, workSpec.c, numValueOf, workSpec.b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", ((zn5) yn5Var).a(workSpec.a))));
            } catch (Throwable th) {
                cursorG.close();
                ct3VarE.i();
                throw th;
            }
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.QnHx doWork() throws Throwable {
        ct3 ct3Var;
        ArrayList arrayList;
        gz4 gz4Var;
        pn5 pn5Var;
        yn5 yn5Var;
        int i;
        WorkDatabase workDatabase = nn5.W0(getApplicationContext()).y;
        QnHx qnHxN = workDatabase.n();
        pn5 pn5VarL = workDatabase.l();
        yn5 yn5VarO = workDatabase.o();
        gz4 gz4VarK = workDatabase.k();
        long jCurrentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        CQf cQf = (CQf) qnHxN;
        cQf.getClass();
        ct3 ct3VarE = ct3.e(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        ct3VarE.f(1, jCurrentTimeMillis);
        at3 at3Var = cQf.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            int iY = AY.y(cursorG, "required_network_type");
            int iY2 = AY.y(cursorG, "requires_charging");
            int iY3 = AY.y(cursorG, "requires_device_idle");
            int iY4 = AY.y(cursorG, "requires_battery_not_low");
            int iY5 = AY.y(cursorG, "requires_storage_not_low");
            int iY6 = AY.y(cursorG, "trigger_content_update_delay");
            int iY7 = AY.y(cursorG, "trigger_max_content_delay");
            int iY8 = AY.y(cursorG, "content_uri_triggers");
            int iY9 = AY.y(cursorG, FacebookAdapter.KEY_ID);
            int iY10 = AY.y(cursorG, AdOperationMetric.INIT_STATE);
            int iY11 = AY.y(cursorG, "worker_class_name");
            int iY12 = AY.y(cursorG, "input_merger_class_name");
            int iY13 = AY.y(cursorG, "input");
            int iY14 = AY.y(cursorG, "output");
            ct3Var = ct3VarE;
            try {
                int iY15 = AY.y(cursorG, "initial_delay");
                int iY16 = AY.y(cursorG, "interval_duration");
                int iY17 = AY.y(cursorG, "flex_duration");
                int iY18 = AY.y(cursorG, "run_attempt_count");
                int iY19 = AY.y(cursorG, "backoff_policy");
                int iY20 = AY.y(cursorG, "backoff_delay_duration");
                int iY21 = AY.y(cursorG, "period_start_time");
                int iY22 = AY.y(cursorG, "minimum_retention_duration");
                int iY23 = AY.y(cursorG, "schedule_requested_at");
                int iY24 = AY.y(cursorG, "run_in_foreground");
                int iY25 = AY.y(cursorG, "out_of_quota_policy");
                int i2 = iY14;
                ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!cursorG.moveToNext()) {
                        break;
                    }
                    String string = cursorG.getString(iY9);
                    String string2 = cursorG.getString(iY11);
                    int i3 = iY11;
                    h70 h70Var = new h70();
                    int i4 = iY;
                    h70Var.a = bo5.c(cursorG.getInt(iY));
                    h70Var.b = cursorG.getInt(iY2) != 0;
                    h70Var.c = cursorG.getInt(iY3) != 0;
                    h70Var.d = cursorG.getInt(iY4) != 0;
                    h70Var.e = cursorG.getInt(iY5) != 0;
                    int i5 = iY2;
                    int i6 = iY3;
                    h70Var.f = cursorG.getLong(iY6);
                    h70Var.g = cursorG.getLong(iY7);
                    h70Var.h = bo5.a(cursorG.getBlob(iY8));
                    WorkSpec workSpec = new WorkSpec(string, string2);
                    workSpec.b = bo5.e(cursorG.getInt(iY10));
                    workSpec.d = cursorG.getString(iY12);
                    workSpec.e = androidx.work.CQf.a(cursorG.getBlob(iY13));
                    int i7 = i2;
                    workSpec.f = androidx.work.CQf.a(cursorG.getBlob(i7));
                    i2 = i7;
                    int i8 = iY12;
                    int i9 = iY15;
                    workSpec.g = cursorG.getLong(i9);
                    int i10 = iY13;
                    int i11 = iY16;
                    workSpec.h = cursorG.getLong(i11);
                    int i12 = iY10;
                    int i13 = iY17;
                    workSpec.i = cursorG.getLong(i13);
                    int i14 = iY18;
                    workSpec.k = cursorG.getInt(i14);
                    int i15 = iY19;
                    workSpec.l = bo5.b(cursorG.getInt(i15));
                    iY17 = i13;
                    int i16 = iY20;
                    workSpec.m = cursorG.getLong(i16);
                    int i17 = iY21;
                    workSpec.n = cursorG.getLong(i17);
                    iY21 = i17;
                    int i18 = iY22;
                    workSpec.o = cursorG.getLong(i18);
                    int i19 = iY23;
                    workSpec.p = cursorG.getLong(i19);
                    int i20 = iY24;
                    workSpec.q = cursorG.getInt(i20) != 0;
                    int i21 = iY25;
                    workSpec.r = bo5.d(cursorG.getInt(i21));
                    workSpec.j = h70Var;
                    arrayList.add(workSpec);
                    iY25 = i21;
                    iY13 = i10;
                    iY2 = i5;
                    iY16 = i11;
                    iY18 = i14;
                    iY23 = i19;
                    iY24 = i20;
                    iY22 = i18;
                    iY15 = i9;
                    iY12 = i8;
                    iY3 = i6;
                    iY = i4;
                    arrayList2 = arrayList;
                    iY11 = i3;
                    iY20 = i16;
                    iY10 = i12;
                    iY19 = i15;
                }
                cursorG.close();
                ct3Var.i();
                ArrayList arrayListD = cQf.d();
                ArrayList arrayListB = cQf.b();
                boolean zIsEmpty = arrayList.isEmpty();
                String str = C;
                if (zIsEmpty) {
                    gz4Var = gz4VarK;
                    pn5Var = pn5VarL;
                    yn5Var = yn5VarO;
                    i = 0;
                } else {
                    i = 0;
                    s52.c().d(str, "Recently completed work:\n\n", new Throwable[0]);
                    gz4Var = gz4VarK;
                    pn5Var = pn5VarL;
                    yn5Var = yn5VarO;
                    s52.c().d(str, a(pn5Var, yn5Var, gz4Var, arrayList), new Throwable[0]);
                }
                if (!arrayListD.isEmpty()) {
                    s52.c().d(str, "Running work:\n\n", new Throwable[i]);
                    s52.c().d(str, a(pn5Var, yn5Var, gz4Var, arrayListD), new Throwable[i]);
                }
                if (!arrayListB.isEmpty()) {
                    s52.c().d(str, "Enqueued work:\n\n", new Throwable[i]);
                    s52.c().d(str, a(pn5Var, yn5Var, gz4Var, arrayListB), new Throwable[i]);
                }
                return new ListenableWorker.QnHx.F1();
            } catch (Throwable th) {
                th = th;
                cursorG.close();
                ct3Var.i();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ct3Var = ct3VarE;
        }
    }
}
