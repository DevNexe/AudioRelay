package androidx.work;

import defpackage.ho1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends ho1 {
    @Override // defpackage.ho1
    public final CQf a(ArrayList arrayList) throws Throwable {
        CQf.QnHx qnHx = new CQf.QnHx();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((CQf) it.next()).a));
        }
        qnHx.a(map);
        CQf cQf = new CQf(qnHx.a);
        CQf.b(cQf);
        return cQf;
    }
}
