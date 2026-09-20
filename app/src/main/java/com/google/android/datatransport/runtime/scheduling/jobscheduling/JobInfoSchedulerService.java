package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.ie5;
import defpackage.j4;
import defpackage.ke3;
import defpackage.ne5;
import defpackage.qs1;
import defpackage.ua5;
import defpackage.ya5;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int w = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        ya5.b(getApplicationContext());
        j4.QnHx qnHxA = ua5.a();
        qnHxA.b(string);
        qnHxA.c(ke3.b(i));
        int i3 = 0;
        if (string2 != null) {
            qnHxA.b = Base64.decode(string2, 0);
        }
        ne5 ne5Var = ya5.a().d;
        j4 j4VarA = qnHxA.a();
        qs1 qs1Var = new qs1(i3, this, jobParameters);
        ne5Var.getClass();
        ne5Var.e.execute(new ie5(ne5Var, j4VarA, i2, qs1Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
