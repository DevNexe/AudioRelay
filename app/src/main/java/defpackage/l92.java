package defpackage;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.com5Fixed;
import com.google.protobuf.o_K;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class l92 implements j92 {
    @Override // defpackage.j92
    public final Object a(Object obj) {
        ((com5Fixed) obj).w = false;
        return obj;
    }

    @Override // defpackage.j92
    public final void b(Object obj) {
        ((o_K) obj).getClass();
    }

    @Override // defpackage.j92
    public final void c(int i, Object obj, Object obj2) {
        com5Fixed com5Var = (com5Fixed) obj;
        o_K o_k = (o_K) obj2;
        if (com5Var.isEmpty()) {
            return;
        }
        Iterator it = com5Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            o_k.getClass();
            Logger logger = CodedOutputStream.x;
            throw null;
        }
    }

    @Override // defpackage.j92
    public final Map<?, ?> d(Object obj) {
        return (com5Fixed) obj;
    }
}
