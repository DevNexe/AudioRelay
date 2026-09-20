package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public final class ps1 implements xn5 {
    public final Context a;
    public final mu0 b;
    public final e54 c;

    public ps1(Context context, mu0 mu0Var, e54 e54Var) {
        this.a = context;
        this.b = mu0Var;
        this.c = e54Var;
    }

    @Override // defpackage.xn5
    public final void a(ua5 ua5Var, int i) {
        b(ua5Var, i, false);
    }

    @Override // defpackage.xn5
    public final void b(ua5 ua5Var, int i, boolean z) {
        boolean z2;
        Context context = this.a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(ua5Var.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(ke3.a(ua5Var.d())).array());
        if (ua5Var.c() != null) {
            adler32.update(ua5Var.c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (it.hasNext()) {
                    JobInfo next = it.next();
                    int i2 = next.getExtras().getInt("attemptNumber");
                    if (next.getId() == value) {
                        if (i2 >= i) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                break;
            }
            if (z2) {
                y52.a(ua5Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        long jN = this.b.N(ua5Var);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        ie3 ie3VarD = ua5Var.d();
        e54 e54Var = this.c;
        builder.setMinimumLatency(e54Var.b(ie3VarD, jN, i));
        Set<e54.CQf> setB = e54Var.c().get(ie3VarD).b();
        if (setB.contains(e54.CQf.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (setB.contains(e54.CQf.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (setB.contains(e54.CQf.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", ua5Var.b());
        persistableBundle.putInt("priority", ke3.a(ua5Var.d()));
        if (ua5Var.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(ua5Var.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {ua5Var, Integer.valueOf(value), Long.valueOf(e54Var.b(ua5Var.d(), jN, i)), Long.valueOf(jN), Integer.valueOf(i)};
        String strC = y52.c("JobInfoScheduler");
        if (Log.isLoggable(strC, 3)) {
            Log.d(strC, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
