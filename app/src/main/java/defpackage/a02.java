package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a02 implements cw4 {
    public final yz1 w;
    public final LinkedHashMap x = new LinkedHashMap();

    public a02(yz1 yz1Var) {
        this.w = yz1Var;
    }

    @Override // defpackage.cw4
    public final void a(cw4.QnHx qnHx) {
        LinkedHashMap linkedHashMap = this.x;
        linkedHashMap.clear();
        Iterator<Object> it = qnHx.iterator();
        while (it.hasNext()) {
            Object objB = this.w.b(it.next());
            Integer num = (Integer) linkedHashMap.get(objB);
            int iIntValue = num != null ? num.intValue() : 0;
            if (iIntValue == 7) {
                it.remove();
            } else {
                linkedHashMap.put(objB, Integer.valueOf(iIntValue + 1));
            }
        }
    }

    @Override // defpackage.cw4
    public final boolean b(Object obj, Object obj2) {
        yz1 yz1Var = this.w;
        return ur1.a(yz1Var.b(obj), yz1Var.b(obj2));
    }
}
