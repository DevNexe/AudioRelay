package defpackage;

import androidx.work.impl.model.WorkProgress;

/* JADX INFO: loaded from: classes.dex */
public final class sn5 implements rn5 {
    public final at3 a;
    public final QnHx b;
    public final CQf c;
    public final F1 d;

    public class CQf extends qj4 {
        public CQf(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class F1 extends qj4 {
        public F1(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public class QnHx extends nt0<WorkProgress> {
        public QnHx(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // defpackage.nt0
        public final void d(v61 v61Var, WorkProgress workProgress) throws Throwable {
            WorkProgress workProgress2 = workProgress;
            String str = workProgress2.a;
            if (str == null) {
                v61Var.f(1);
            } else {
                v61Var.g(1, str);
            }
            byte[] bArrB = androidx.work.CQf.b(workProgress2.b);
            if (bArrB == null) {
                v61Var.f(2);
            } else {
                v61Var.b(2, bArrB);
            }
        }
    }

    public sn5(at3 at3Var) {
        this.a = at3Var;
        this.b = new QnHx(at3Var);
        this.c = new CQf(at3Var);
        this.d = new F1(at3Var);
    }
}
