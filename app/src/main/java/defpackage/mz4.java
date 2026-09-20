package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.QnHx;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.Preference;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class mz4 implements d54 {
    public static final String A = s52.e("SystemJobScheduler");
    public final Context w;
    public final JobScheduler x;
    public final nn5 y;
    public final lz4 z;

    public mz4(Context context, nn5 nn5Var) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        lz4 lz4Var = new lz4(context);
        this.w = context;
        this.y = nn5Var;
        this.x = jobScheduler;
        this.z = lz4Var;
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            s52.c().b(A, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public static ArrayList e(Context context, JobScheduler jobScheduler, String str) {
        String string;
        ArrayList<JobInfo> arrayListF = f(context, jobScheduler);
        if (arrayListF == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
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
            if (str.equals(string)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            s52.c().b(A, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // defpackage.d54
    public final void a(WorkSpec... workSpecArr) {
        int i;
        ArrayList arrayListE;
        int iIntValue;
        WorkSpec workSpec;
        nn5 nn5Var = this.y;
        WorkDatabase workDatabase = nn5Var.y;
        int length = workSpecArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            WorkSpec workSpec2 = workSpecArr[i3];
            workDatabase.c();
            try {
                WorkSpec workSpecI = ((CQf) workDatabase.n()).i(workSpec2.a);
                String str = A;
                if (workSpecI == null) {
                    s52.c().f(str, "Skipping scheduling " + workSpec2.a + " because it's no longer in the DB", new Throwable[i2]);
                    workDatabase.h();
                } else {
                    if (workSpecI.b != kn5.ENQUEUED) {
                        s52.c().f(str, "Skipping scheduling " + workSpec2.a + " because it is no longer enqueued", new Throwable[i2]);
                        workDatabase.h();
                    } else {
                        SystemIdInfo systemIdInfoA = ((hz4) workDatabase.k()).a(workSpec2.a);
                        if (systemIdInfoA != null) {
                            i = systemIdInfoA.b;
                        } else {
                            nn5Var.x.getClass();
                            int i4 = nn5Var.x.g;
                            synchronized (sh1.class) {
                                workDatabase.c();
                                try {
                                    Long lA = ((ta3) workDatabase.j()).a("next_job_scheduler_id");
                                    int iIntValue2 = lA != null ? lA.intValue() : 0;
                                    ((ta3) workDatabase.j()).b(new Preference("next_job_scheduler_id", iIntValue2 == Integer.MAX_VALUE ? 0 : iIntValue2 + 1));
                                    workDatabase.h();
                                    workDatabase.f();
                                    if (iIntValue2 < 0 || iIntValue2 > i4) {
                                        ((ta3) workDatabase.j()).b(new Preference("next_job_scheduler_id", 1));
                                        i = 0;
                                    } else {
                                        i = iIntValue2;
                                    }
                                } catch (Throwable th) {
                                    workDatabase.f();
                                    throw th;
                                }
                            }
                        }
                        if (systemIdInfoA == null) {
                            SystemIdInfo systemIdInfo = new SystemIdInfo(workSpec2.a, i);
                            hz4 hz4Var = (hz4) nn5Var.y.k();
                            at3 at3Var = hz4Var.a;
                            at3Var.b();
                            at3Var.c();
                            try {
                                hz4Var.b.e(systemIdInfo);
                                at3Var.h();
                                at3Var.f();
                            } catch (Throwable th2) {
                                at3Var.f();
                                throw th2;
                            }
                        }
                        g(workSpec2, i);
                        if (Build.VERSION.SDK_INT == 23 && (arrayListE = e(this.w, this.x, workSpec2.a)) != null) {
                            int iIndexOf = arrayListE.indexOf(Integer.valueOf(i));
                            if (iIndexOf >= 0) {
                                arrayListE.remove(iIndexOf);
                            }
                            if (arrayListE.isEmpty()) {
                                nn5Var.x.getClass();
                                int i5 = nn5Var.x.g;
                                synchronized (sh1.class) {
                                    workDatabase.c();
                                    try {
                                        Long lA2 = ((ta3) workDatabase.j()).a("next_job_scheduler_id");
                                        int iIntValue3 = lA2 != null ? lA2.intValue() : 0;
                                        ((ta3) workDatabase.j()).b(new Preference("next_job_scheduler_id", iIntValue3 == Integer.MAX_VALUE ? 0 : iIntValue3 + 1));
                                        workDatabase.h();
                                        workDatabase.f();
                                        if (iIntValue3 < 0 || iIntValue3 > i5) {
                                            ((ta3) workDatabase.j()).b(new Preference("next_job_scheduler_id", 1));
                                            iIntValue = 0;
                                        } else {
                                            iIntValue = iIntValue3;
                                        }
                                    } catch (Throwable th3) {
                                        workDatabase.f();
                                        throw th3;
                                    }
                                }
                                workSpec = workSpec2;
                            } else {
                                iIntValue = ((Integer) arrayListE.get(0)).intValue();
                                workSpec = workSpec2;
                            }
                            g(workSpec, iIntValue);
                        }
                        workDatabase.h();
                    }
                    workDatabase.f();
                    i3++;
                    i2 = 0;
                }
                i3 = i3;
                workDatabase.f();
                i3++;
                i2 = 0;
            } catch (Throwable th4) {
                workDatabase.f();
                throw th4;
            }
        }
    }

    @Override // defpackage.d54
    public final boolean b() {
        return true;
    }

    @Override // defpackage.d54
    public final void d(String str) {
        Context context = this.w;
        JobScheduler jobScheduler = this.x;
        ArrayList arrayListE = e(context, jobScheduler, str);
        if (arrayListE == null || arrayListE.isEmpty()) {
            return;
        }
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((Integer) it.next()).intValue());
        }
        ((hz4) this.y.y.k()).b(str);
    }

    public final void g(WorkSpec workSpec, int i) {
        JobScheduler jobScheduler = this.x;
        JobInfo jobInfoA = this.z.a(workSpec, i);
        s52 s52VarC = s52.c();
        Object[] objArr = {workSpec.a, Integer.valueOf(i)};
        String str = A;
        s52VarC.a(str, String.format("Scheduling work ID %s Job ID %s", objArr), new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoA) == 0) {
                s52.c().f(str, String.format("Unable to schedule work ID %s", workSpec.a), new Throwable[0]);
                if (workSpec.q && workSpec.r == 1) {
                    workSpec.q = false;
                    s52.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.a), new Throwable[0]);
                    g(workSpec, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList arrayListF = f(this.w, jobScheduler);
            int size = arrayListF != null ? arrayListF.size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(size);
            nn5 nn5Var = this.y;
            objArr2[1] = Integer.valueOf(((CQf) nn5Var.y.n()).e().size());
            QnHx qnHx = nn5Var.x;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = qnHx.h;
            if (i2 == 23) {
                i3 /= 2;
            }
            objArr2[2] = Integer.valueOf(i3);
            String str2 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr2);
            s52.c().b(str, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e);
        } catch (Throwable th) {
            s52.c().b(str, String.format("Unable to schedule %s", workSpec), th);
        }
    }
}
