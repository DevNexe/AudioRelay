package defpackage;

import android.os.Build;
import androidx.work.QnHx;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k54 {
    public static final String a = s52.e("Schedulers");

    public static void a(QnHx qnHx, WorkDatabase workDatabase, List<d54> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        androidx.work.impl.model.QnHx qnHxN = workDatabase.n();
        workDatabase.c();
        try {
            int i = Build.VERSION.SDK_INT;
            int i2 = qnHx.h;
            if (i == 23) {
                i2 /= 2;
            }
            CQf cQf = (CQf) qnHxN;
            ArrayList arrayListC = cQf.c(i2);
            ArrayList arrayListB = cQf.b();
            if (arrayListC.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    cQf.k(((WorkSpec) it.next()).a, jCurrentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListC.size() > 0) {
                WorkSpec[] workSpecArr = (WorkSpec[]) arrayListC.toArray(new WorkSpec[arrayListC.size()]);
                for (d54 d54Var : list) {
                    if (d54Var.b()) {
                        d54Var.a(workSpecArr);
                    }
                }
            }
            if (arrayListB.size() > 0) {
                WorkSpec[] workSpecArr2 = (WorkSpec[]) arrayListB.toArray(new WorkSpec[arrayListB.size()]);
                for (d54 d54Var2 : list) {
                    if (!d54Var2.b()) {
                        d54Var2.a(workSpecArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
