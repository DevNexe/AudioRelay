package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zd4 extends cx1 implements j81<pd4, Boolean> {
    public final /* synthetic */ List<pd4> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd4(ArrayList arrayList) {
        super(1);
        this.w = arrayList;
    }

    @Override // defpackage.j81
    public final Boolean invoke(pd4 pd4Var) {
        boolean z;
        pd4 pd4Var2 = pd4Var;
        List<pd4> list = this.w;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (ur1.a(((pd4) it.next()).b.b, pd4Var2.b.b)) {
                    z = true;
                }
            }
            z = false;
        }
        return Boolean.valueOf(!z);
    }
}
