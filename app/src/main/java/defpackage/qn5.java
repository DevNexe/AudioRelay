package defpackage;

import androidx.work.impl.model.WorkName;

/* JADX INFO: loaded from: classes.dex */
public final class qn5 implements pn5 {
    public final at3 a;
    public final QnHx b;

    public class QnHx extends nt0<WorkName> {
        public QnHx(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // defpackage.nt0
        public final void d(v61 v61Var, WorkName workName) {
            WorkName workName2 = workName;
            String str = workName2.a;
            if (str == null) {
                v61Var.f(1);
            } else {
                v61Var.g(1, str);
            }
            String str2 = workName2.b;
            if (str2 == null) {
                v61Var.f(2);
            } else {
                v61Var.g(2, str2);
            }
        }
    }

    public qn5(at3 at3Var) {
        this.a = at3Var;
        this.b = new QnHx(at3Var);
    }
}
