package defpackage;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qs1 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ qs1(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        mi0.QnHx<T> qnHx;
        switch (this.w) {
            case 0:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.x;
                JobParameters jobParameters = (JobParameters) this.y;
                int i = JobInfoSchedulerService.w;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 1:
                sv2 sv2Var = (sv2) this.x;
                pg3<T> pg3Var = (pg3) this.y;
                if (sv2Var.b != sv2.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (sv2Var) {
                    qnHx = sv2Var.a;
                    sv2Var.a = null;
                    sv2Var.b = pg3Var;
                    break;
                }
                qnHx.f(pg3Var);
                return;
            case 2:
                Map.Entry entry = (Map.Entry) this.x;
                ((au0) entry.getKey()).a((xt0) this.y);
                return;
            default:
                wm wmVar = (wm) this.x;
                h54 h54Var = (h54) this.y;
                int i2 = h54.z;
                wmVar.N(h54Var, sd5.a);
                return;
        }
    }
}
