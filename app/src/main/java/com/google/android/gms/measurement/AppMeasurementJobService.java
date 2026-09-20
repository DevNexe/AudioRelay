package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import defpackage.bi6;
import defpackage.d76;
import defpackage.dq6;
import defpackage.f17;
import defpackage.h17;
import defpackage.r27;
import defpackage.tb7;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements f17 {
    public h17 w;

    @Override // defpackage.f17
    public final void a(Intent intent) {
    }

    @Override // defpackage.f17
    @TargetApi(24)
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final h17 c() {
        if (this.w == null) {
            this.w = new h17(this);
        }
        return this.w;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        bi6 bi6Var = dq6.p(c().a, null, null).i;
        dq6.h(bi6Var);
        bi6Var.n.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        bi6 bi6Var = dq6.p(c().a, null, null).i;
        dq6.h(bi6Var);
        bi6Var.n.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().a(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        h17 h17VarC = c();
        bi6 bi6Var = dq6.p(h17VarC.a, null, null).i;
        dq6.h(bi6Var);
        String string = jobParameters.getExtras().getString("action");
        bi6Var.n.c(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        d76 d76Var = new d76(h17VarC, bi6Var, jobParameters);
        r27 r27VarK = r27.K(h17VarC.a);
        r27VarK.zzaz().m(new tb7(r27VarK, d76Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().b(intent);
        return true;
    }

    @Override // defpackage.f17
    public final boolean zzc(int i) {
        throw new UnsupportedOperationException();
    }
}
