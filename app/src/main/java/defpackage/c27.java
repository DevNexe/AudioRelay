package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class c27 extends g27 {
    public final AlarmManager d;
    public a27 e;
    public Integer f;

    public c27(r27 r27Var) {
        super(r27Var);
        this.d = (AlarmManager) this.a.a.getSystemService("alarm");
    }

    @Override // defpackage.g27
    public final void h() {
        JobScheduler jobScheduler;
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(k());
        }
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) this.a.a.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(j());
    }

    public final void i() {
        JobScheduler jobScheduler;
        f();
        dq6 dq6Var = this.a;
        bi6 bi6Var = dq6Var.i;
        dq6.h(bi6Var);
        bi6Var.n.b("Unscheduling upload");
        AlarmManager alarmManager = this.d;
        if (alarmManager != null) {
            alarmManager.cancel(k());
        }
        l().a();
        if (Build.VERSION.SDK_INT < 24 || (jobScheduler = (JobScheduler) dq6Var.a.getSystemService("jobscheduler")) == null) {
            return;
        }
        jobScheduler.cancel(j());
    }

    public final int j() {
        if (this.f == null) {
            this.f = Integer.valueOf("measurement".concat(String.valueOf(this.a.a.getPackageName())).hashCode());
        }
        return this.f.intValue();
    }

    public final PendingIntent k() {
        Context context = this.a.a;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), r56.a);
    }

    public final fz5 l() {
        if (this.e == null) {
            this.e = new a27(this, this.b.l);
        }
        return this.e;
    }
}
