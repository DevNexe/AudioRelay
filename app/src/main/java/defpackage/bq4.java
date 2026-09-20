package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bq4 extends cx1 implements h81<sd5> {
    public final /* synthetic */ aq4 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq4(aq4 aq4Var) {
        super(0);
        this.w = aq4Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        ui2<aq4.QnHx<?>> ui2Var = this.w.d;
        int i = ui2Var.y;
        if (i > 0) {
            aq4.QnHx<?>[] qnHxArr = ui2Var.w;
            int i2 = 0;
            do {
                aq4.QnHx<?> qnHx = qnHxArr[i2];
                HashSet<Object> hashSet = qnHx.c;
                if (!hashSet.isEmpty()) {
                    Iterator<Object> it = hashSet.iterator();
                    while (it.hasNext()) {
                        qnHx.a.invoke(it.next());
                    }
                    hashSet.clear();
                }
                i2++;
            } while (i2 < i);
        }
        return sd5.a;
    }
}
