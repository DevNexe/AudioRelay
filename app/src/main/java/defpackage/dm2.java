package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.flow.QnHx;

/* JADX INFO: loaded from: classes.dex */
public abstract class dm2 {
    public final ReentrantLock a = new ReentrantLock(true);
    public final QnHx b;
    public final QnHx c;
    public boolean d;
    public final ii3 e;
    public final ii3 f;

    public dm2() {
        QnHx qnHxO = FWT.o(cs0.w);
        this.b = qnHxO;
        QnHx qnHxO2 = FWT.o(hs0.w);
        this.c = qnHxO2;
        this.e = new ii3(qnHxO, null);
        this.f = new ii3(qnHxO2, null);
    }

    public abstract kk2 a(dl2 dl2Var, Bundle bundle);

    public void b(kk2 kk2Var) {
        QnHx qnHx = this.c;
        Set set = (Set) qnHx.getValue();
        LinkedHashSet linkedHashSet = new LinkedHashSet(C0239D.A(set.size()));
        boolean z = false;
        for (Object obj : set) {
            boolean z2 = true;
            if (!z && ur1.a(obj, kk2Var)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj);
            }
        }
        qnHx.setValue(linkedHashSet);
    }

    public void c(kk2 kk2Var, boolean z) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            QnHx qnHx = this.b;
            Iterable iterable = (Iterable) qnHx.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!(!ur1.a((kk2) obj, kk2Var))) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            qnHx.setValue(arrayList);
            sd5 sd5Var = sd5.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void d(kk2 kk2Var, boolean z) {
        Object objPrevious;
        kk2 kk2Var2;
        QnHx qnHx = this.c;
        qnHx.setValue(og4.d0((Set) qnHx.getValue(), kk2Var));
        ii3 ii3Var = this.e;
        List list = (List) ii3Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                kk2Var2 = (kk2) objPrevious;
            }
        } while (!(!ur1.a(kk2Var2, kk2Var) && ((List) ii3Var.getValue()).lastIndexOf(kk2Var2) < ((List) ii3Var.getValue()).lastIndexOf(kk2Var)));
        kk2 kk2Var3 = (kk2) objPrevious;
        if (kk2Var3 != null) {
            qnHx.setValue(og4.d0((Set) qnHx.getValue(), kk2Var3));
        }
        c(kk2Var, z);
    }

    public void e(kk2 kk2Var) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            QnHx qnHx = this.b;
            qnHx.setValue(wu.V0(kk2Var, (Collection) qnHx.getValue()));
            sd5 sd5Var = sd5.a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
