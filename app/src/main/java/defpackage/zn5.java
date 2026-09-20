package defpackage;

import android.database.Cursor;
import androidx.work.impl.model.WorkTag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zn5 implements yn5 {
    public final at3 a;
    public final QnHx b;

    public class QnHx extends nt0<WorkTag> {
        public QnHx(at3 at3Var) {
            super(at3Var);
        }

        @Override // defpackage.qj4
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // defpackage.nt0
        public final void d(v61 v61Var, WorkTag workTag) {
            WorkTag workTag2 = workTag;
            String str = workTag2.a;
            if (str == null) {
                v61Var.f(1);
            } else {
                v61Var.g(1, str);
            }
            String str2 = workTag2.b;
            if (str2 == null) {
                v61Var.f(2);
            } else {
                v61Var.g(2, str2);
            }
        }
    }

    public zn5(at3 at3Var) {
        this.a = at3Var;
        this.b = new QnHx(at3Var);
    }

    public final ArrayList a(String str) {
        ct3 ct3VarE = ct3.e(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            ct3VarE.g(1);
        } else {
            ct3VarE.h(1, str);
        }
        at3 at3Var = this.a;
        at3Var.b();
        Cursor cursorG = at3Var.g(ct3VarE);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            ct3VarE.i();
            return arrayList;
        } catch (Throwable th) {
            cursorG.close();
            ct3VarE.i();
            throw th;
        }
    }
}
