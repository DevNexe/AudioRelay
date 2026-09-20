package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.QnHx;
import androidx.work.impl.model.WorkSpec;
import defpackage.at3;
import defpackage.ct3;
import defpackage.gn5;
import defpackage.hz4;
import defpackage.k54;
import defpackage.kn5;
import defpackage.mz4;
import defpackage.ne3;
import defpackage.nn5;
import defpackage.rn5;
import defpackage.s52;
import defpackage.sn5;
import defpackage.ta3;
import defpackage.v61;
import defpackage.wa3;
import defpackage.zh;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    public final Context w;
    public final nn5 x;
    public int y = 0;
    public static final String z = s52.e("ForceStopRunnable");
    public static final long A = TimeUnit.DAYS.toMillis(3650);

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = s52.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((s52.QnHx) s52.c()).b <= 2) {
                Log.v(a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, nn5 nn5Var) {
        this.w = context.getApplicationContext();
        this.x = nn5Var;
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = zh.a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + A;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    public final void a() {
        boolean z2;
        boolean z3;
        String string;
        int i = Build.VERSION.SDK_INT;
        Context context = this.w;
        int i2 = 1;
        nn5 nn5Var = this.x;
        if (i >= 23) {
            String str = mz4.A;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            ArrayList<JobInfo> arrayListF = mz4.f(context, jobScheduler);
            hz4 hz4Var = (hz4) nn5Var.y.k();
            hz4Var.getClass();
            ct3 ct3VarE = ct3.e(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
            at3 at3Var = hz4Var.a;
            at3Var.b();
            Cursor cursorG = at3Var.g(ct3VarE);
            try {
                ArrayList arrayList = new ArrayList(cursorG.getCount());
                while (cursorG.moveToNext()) {
                    arrayList.add(cursorG.getString(0));
                }
                cursorG.close();
                ct3VarE.i();
                HashSet hashSet = new HashSet(arrayListF != null ? arrayListF.size() : 0);
                if (arrayListF != null && !arrayListF.isEmpty()) {
                    for (JobInfo jobInfo : arrayListF) {
                        PersistableBundle extras = jobInfo.getExtras();
                        if (extras != null) {
                            try {
                                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                    string = extras.getString("EXTRA_WORK_SPEC_ID");
                                } else {
                                    string = null;
                                }
                            } catch (NullPointerException unused) {
                            }
                        } else {
                            string = null;
                        }
                        if (TextUtils.isEmpty(string)) {
                            mz4.c(jobScheduler, jobInfo.getId());
                        } else {
                            hashSet.add(string);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!hashSet.contains((String) it.next())) {
                            s52.c().a(mz4.A, "Reconciling jobs", new Throwable[0]);
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    WorkDatabase workDatabase = nn5Var.y;
                    workDatabase.c();
                    try {
                        QnHx qnHxN = workDatabase.n();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((CQf) qnHxN).k((String) it2.next(), -1L);
                        }
                        workDatabase.h();
                        workDatabase.f();
                    } catch (Throwable th) {
                        workDatabase.f();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                cursorG.close();
                ct3VarE.i();
                throw th2;
            }
        } else {
            z2 = false;
        }
        WorkDatabase workDatabase2 = nn5Var.y;
        QnHx qnHxN2 = workDatabase2.n();
        rn5 rn5VarM = workDatabase2.m();
        workDatabase2.c();
        try {
            CQf cQf = (CQf) qnHxN2;
            ArrayList<WorkSpec> arrayListD = cQf.d();
            boolean z4 = !arrayListD.isEmpty();
            if (z4) {
                for (WorkSpec workSpec : arrayListD) {
                    kn5 kn5Var = kn5.ENQUEUED;
                    String[] strArr = new String[i2];
                    strArr[0] = workSpec.a;
                    cQf.n(kn5Var, strArr);
                    cQf.k(workSpec.a, -1L);
                    i2 = 1;
                }
            }
            sn5 sn5Var = (sn5) rn5VarM;
            at3 at3Var2 = sn5Var.a;
            at3Var2.b();
            sn5.F1 f1 = sn5Var.d;
            v61 v61VarA = f1.a();
            at3Var2.c();
            try {
                v61VarA.h();
                at3Var2.h();
                at3Var2.f();
                f1.c(v61VarA);
                workDatabase2.h();
                workDatabase2.f();
                boolean z5 = z4 || z2;
                Long lA = ((ta3) nn5Var.C.a.j()).a("reschedule_needed");
                boolean z6 = lA != null && lA.longValue() == 1;
                String str2 = z;
                if (z6) {
                    s52.c().a(str2, "Rescheduling Workers.", new Throwable[0]);
                    nn5Var.Z0();
                    wa3 wa3Var = nn5Var.C;
                    wa3Var.getClass();
                    ((ta3) wa3Var.a.j()).b(new Preference("reschedule_needed", 0L));
                    return;
                }
                try {
                    int i3 = zh.a() ? 570425344 : 536870912;
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
                    intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                    if (Build.VERSION.SDK_INT >= 30) {
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            int i4 = 0;
                            while (true) {
                                if (i4 < historicalProcessExitReasons.size()) {
                                    if (((ApplicationExitInfo) historicalProcessExitReasons.get(i4)).getReason() == 10) {
                                        z3 = true;
                                    } else {
                                        i4++;
                                    }
                                }
                            }
                        }
                        z3 = false;
                    } else if (broadcast == null) {
                        c(context);
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } catch (IllegalArgumentException | SecurityException e) {
                    s52.c().f(str2, "Ignoring exception", e);
                }
                if (z3) {
                    s52.c().a(str2, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    nn5Var.Z0();
                } else if (z5) {
                    s52.c().a(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                    k54.a(nn5Var.x, nn5Var.y, nn5Var.A);
                }
            } catch (Throwable th3) {
                at3Var2.f();
                f1.c(v61VarA);
                throw th3;
            }
        } catch (Throwable th4) {
            workDatabase2.f();
            throw th4;
        }
    }

    public final boolean b() {
        androidx.work.QnHx qnHx = this.x.x;
        qnHx.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = z;
        if (zIsEmpty) {
            s52.c().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = ne3.a(this.w, qnHx);
        s52.c().a(str, String.format("Is default app process = %s", Boolean.valueOf(zA)), new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = z;
        nn5 nn5Var = this.x;
        try {
            if (!b()) {
                nn5Var.Y0();
                return;
            }
            while (true) {
                gn5.a(this.w);
                s52.c().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    nn5Var.Y0();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.y + 1;
                    this.y = i;
                    if (i >= 3) {
                        s52.c().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        nn5Var.x.getClass();
                        throw illegalStateException;
                    }
                    s52.c().a(str, String.format("Retrying after %s", Long.valueOf(((long) i) * 300)), e);
                    try {
                        Thread.sleep(((long) this.y) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            nn5Var.Y0();
            throw th;
        }
    }
}
