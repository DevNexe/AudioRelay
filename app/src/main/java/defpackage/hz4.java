package defpackage;

import android.database.Cursor;
import androidx.work.impl.model.SystemIdInfo;

/* JADX INFO: loaded from: classes.dex */
public final class hz4 implements gz4 {
    public final at3 a;
    public final QnHx b;
    public final CQf c;

    public class CQf extends qj4 {
        public CQf(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public class QnHx extends nt0<SystemIdInfo> {
        public QnHx(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // defpackage.nt0
        public final void d(v61 v61Var, SystemIdInfo systemIdInfo) {
            SystemIdInfo systemIdInfo2 = systemIdInfo;
            String str = systemIdInfo2.a;
            if (str == null) {
                v61Var.f(1);
            } else {
                v61Var.g(1, str);
            }
            v61Var.e(2, systemIdInfo2.b);
        }
    }

    public hz4(at3 at3Var) {
        this.a = at3Var;
        this.b = new QnHx(at3Var);
        this.c = new CQf(at3Var);
    }

    public final SystemIdInfo a(String str) {
        ct3 ct3VarE = ct3.e(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            ct3VarE.g(1);
        } else {
            ct3VarE.h(1, str);
        }
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            return cursorG.moveToFirst() ? new SystemIdInfo(cursorG.getString(AY.y(cursorG, "work_spec_id")), cursorG.getInt(AY.y(cursorG, "system_id"))) : null;
        } finally {
            cursorG.close();
            ct3VarE.i();
        }
    }

    public final void b(String str) {
        at3 at3Var = this.a;
        at3Var.b();
        CQf cQf = this.c;
        v61 v61VarA = cQf.a();
        if (str == null) {
            v61VarA.f(1);
        } else {
            v61VarA.g(1, str);
        }
        at3Var.c();
        try {
            v61VarA.h();
            at3Var.h();
        } finally {
            at3Var.f();
            cQf.c(v61VarA);
        }
    }
}
