package defpackage;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Com1Fixed;
import com.google.protobuf.QX;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class k92 implements j92 {
    @Override // defpackage.j92
    public final Object a(Object obj) {
        ((QX) obj).a = false;
        return obj;
    }

    @Override // defpackage.j92
    public final void b(Object obj) {
        ((Com1Fixed) obj).getClass();
    }

    @Override // defpackage.j92
    public final void c(int i, Object obj, Object obj2) {
        if (obj == null) {
            return;
        }
        Map mapC = ((QX) obj).c();
        Com1Fixed com1 = (Com1Fixed) obj2;
        if (mapC.isEmpty()) {
            return;
        }
        Iterator it = mapC.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Logger logger = CodedOutputStream.x;
            com1.getClass();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    @Override // defpackage.j92
    public final Map<?, ?> d(Object obj) {
        return ((QX) obj).c();
    }
}
