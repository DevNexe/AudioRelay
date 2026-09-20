package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import defpackage.dv0;
import defpackage.nn5;
import defpackage.oe3;
import defpackage.s52;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements dv0 {
    public static final String y = s52.e("SystemJobService");
    public nn5 w;
    public final HashMap x = new HashMap();

    @Override // defpackage.dv0
    public final void c(String str, boolean z) {
        JobParameters jobParameters;
        s52.c().a(y, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.x) {
            jobParameters = (JobParameters) this.x.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            nn5 nn5VarW0 = nn5.W0(getApplicationContext());
            this.w = nn5VarW0;
            nn5VarW0.B.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            s52.c().f(y, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        nn5 nn5Var = this.w;
        if (nn5Var != null) {
            oe3 oe3Var = nn5Var.B;
            synchronized (oe3Var.G) {
                oe3Var.F.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string;
        if (this.w == null) {
            s52.c().a(y, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        WorkerParameters.QnHx qnHx = null;
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            s52.c().b(y, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.x) {
            if (this.x.containsKey(string)) {
                s52.c().a(y, String.format("Job is already being executed by SystemJobService: %s", string), new Throwable[0]);
                return false;
            }
            s52.c().a(y, String.format("onStartJob for %s", string), new Throwable[0]);
            this.x.put(string, jobParameters);
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                qnHx = new WorkerParameters.QnHx();
                if (jobParameters.getTriggeredContentUris() != null) {
                    qnHx.b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    qnHx.a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    qnHx.c = jobParameters.getNetwork();
                }
            }
            this.w.a1(string, qnHx);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String string;
        boolean zContains;
        if (this.w == null) {
            s52.c().a(y, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            s52.c().b(y, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        s52.c().a(y, String.format("onStopJob for %s", string), new Throwable[0]);
        synchronized (this.x) {
            this.x.remove(string);
        }
        this.w.b1(string);
        oe3 oe3Var = this.w.B;
        synchronized (oe3Var.G) {
            zContains = oe3Var.E.contains(string);
        }
        return !zContains;
    }
}
