package defpackage;

import android.database.Cursor;
import androidx.work.impl.model.Preference;

/* JADX INFO: loaded from: classes.dex */
public final class ta3 implements sa3 {
    public final at3 a;
    public final QnHx b;

    public class QnHx extends nt0<Preference> {
        public QnHx(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // defpackage.nt0
        public final void d(v61 v61Var, Preference preference) {
            Preference preference2 = preference;
            String str = preference2.a;
            if (str == null) {
                v61Var.f(1);
            } else {
                v61Var.g(1, str);
            }
            Long l = preference2.b;
            if (l == null) {
                v61Var.f(2);
            } else {
                v61Var.e(2, l.longValue());
            }
        }
    }

    public ta3(at3 at3Var) {
        this.a = at3Var;
        this.b = new QnHx(at3Var);
    }

    public final Long a(String str) {
        ct3 ct3VarE = ct3.e(1, "SELECT long_value FROM Preference where `key`=?");
        ct3VarE.h(1, str);
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            return (!cursorG.moveToFirst() || cursorG.isNull(0)) ? null : Long.valueOf(cursorG.getLong(0));
        } finally {
            cursorG.close();
            ct3VarE.i();
        }
    }

    public final void b(Preference preference) {
        at3 at3Var = this.a;
        at3Var.b();
        at3Var.c();
        try {
            this.b.e(preference);
            at3Var.h();
        } finally {
            at3Var.f();
        }
    }
}
