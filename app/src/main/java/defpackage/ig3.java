package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ig3 {
    public final Map<Class<?>, kq2<?>> a;
    public final Map<Class<?>, fg5<?>> b;
    public final kq2<Object> c;

    public static final class QnHx implements ns0<QnHx> {
        public static final hg3 a = new kq2() { // from class: hg3
            @Override // defpackage.ms0
            public final void a(Object obj, lq2 lq2Var) {
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            }
        };
    }

    public ig3(HashMap map, HashMap map2, hg3 hg3Var) {
        this.a = map;
        this.b = map2;
        this.c = hg3Var;
    }

    public final void a(is isVar, ByteArrayOutputStream byteArrayOutputStream) {
        Map<Class<?>, kq2<?>> map = this.a;
        gg3 gg3Var = new gg3(byteArrayOutputStream, map, this.b, this.c);
        kq2<?> kq2Var = map.get(is.class);
        if (kq2Var != null) {
            kq2Var.a(isVar, gg3Var);
        } else {
            throw new EncodingException("No encoder for " + is.class);
        }
    }
}
