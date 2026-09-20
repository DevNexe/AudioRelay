package defpackage;

import com.google.firebase.encoders.EncodingException;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class gg3 implements lq2 {
    public static final Charset f = Charset.forName("UTF-8");
    public static final yw0 g;
    public static final yw0 h;
    public static final fg3 i;
    public OutputStream a;
    public final Map<Class<?>, kq2<?>> b;
    public final Map<Class<?>, fg5<?>> c;
    public final kq2<Object> d;
    public final jg3 e = new jg3(this);

    /* JADX WARN: Type inference failed for: r0v6, types: [fg3] */
    static {
        iyM iym = new iyM(1);
        HashMap map = new HashMap();
        map.put(dg3.class, iym);
        g = new yw0(SubscriberAttributeKt.JSON_NAME_KEY, Collections.unmodifiableMap(new HashMap(map)));
        iyM iym2 = new iyM(2);
        HashMap map2 = new HashMap();
        map2.put(dg3.class, iym2);
        h = new yw0("value", Collections.unmodifiableMap(new HashMap(map2)));
        i = new kq2() { // from class: fg3
            @Override // defpackage.ms0
            public final void a(Object obj, lq2 lq2Var) {
                Map.Entry entry = (Map.Entry) obj;
                lq2 lq2Var2 = lq2Var;
                lq2Var2.a(gg3.g, entry.getKey());
                lq2Var2.a(gg3.h, entry.getValue());
            }
        };
    }

    public gg3(ByteArrayOutputStream byteArrayOutputStream, Map map, Map map2, kq2 kq2Var) {
        this.a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
        this.d = kq2Var;
    }

    public static int h(yw0 yw0Var) {
        dg3 dg3Var = (dg3) ((Annotation) yw0Var.b.get(dg3.class));
        if (dg3Var != null) {
            return ((iyM) dg3Var).a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // defpackage.lq2
    public final lq2 a(yw0 yw0Var, Object obj) {
        b(yw0Var, obj, true);
        return this;
    }

    public final gg3 b(yw0 yw0Var, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            i((h(yw0Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            i(bytes.length);
            this.a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                b(yw0Var, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(i, yw0Var, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (!z || dDoubleValue != 0.0d) {
                i((h(yw0Var) << 3) | 1);
                this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            }
            return this;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (!z || fFloatValue != 0.0f) {
                i((h(yw0Var) << 3) | 5);
                this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            }
            return this;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (!z || jLongValue != 0) {
                dg3 dg3Var = (dg3) ((Annotation) yw0Var.b.get(dg3.class));
                if (dg3Var == null) {
                    throw new EncodingException("Field has no @Protobuf config");
                }
                i(((iyM) dg3Var).a << 3);
                j(jLongValue);
            }
            return this;
        }
        if (obj instanceof Boolean) {
            c(yw0Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            i((h(yw0Var) << 3) | 2);
            i(bArr.length);
            this.a.write(bArr);
            return this;
        }
        kq2<?> kq2Var = this.b.get(obj.getClass());
        if (kq2Var != null) {
            g(kq2Var, yw0Var, obj, z);
            return this;
        }
        fg5<?> fg5Var = this.c.get(obj.getClass());
        if (fg5Var != null) {
            jg3 jg3Var = this.e;
            jg3Var.a = false;
            jg3Var.c = yw0Var;
            jg3Var.b = z;
            fg5Var.a(obj, jg3Var);
            return this;
        }
        if (obj instanceof qf3) {
            c(yw0Var, ((qf3) obj).b(), true);
            return this;
        }
        if (obj instanceof Enum) {
            c(yw0Var, ((Enum) obj).ordinal(), true);
            return this;
        }
        g(this.d, yw0Var, obj, z);
        return this;
    }

    public final void c(yw0 yw0Var, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        dg3 dg3Var = (dg3) ((Annotation) yw0Var.b.get(dg3.class));
        if (dg3Var == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        i(((iyM) dg3Var).a << 3);
        i(i2);
    }

    @Override // defpackage.lq2
    public final lq2 d(yw0 yw0Var, boolean z) {
        c(yw0Var, z ? 1 : 0, true);
        return this;
    }

    @Override // defpackage.lq2
    public final lq2 e(yw0 yw0Var, int i2) {
        c(yw0Var, i2, true);
        return this;
    }

    @Override // defpackage.lq2
    public final lq2 f(yw0 yw0Var, long j) throws IOException {
        if (j != 0) {
            dg3 dg3Var = (dg3) ((Annotation) yw0Var.b.get(dg3.class));
            if (dg3Var == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            i(((iyM) dg3Var).a << 3);
            j(j);
        }
        return this;
    }

    public final void g(kq2 kq2Var, yw0 yw0Var, Object obj, boolean z) throws IOException {
        k22 k22Var = new k22();
        try {
            OutputStream outputStream = this.a;
            this.a = k22Var;
            try {
                kq2Var.a(obj, this);
                this.a = outputStream;
                long j = k22Var.w;
                k22Var.close();
                if (z && j == 0) {
                    return;
                }
                i((h(yw0Var) << 3) | 2);
                j(j);
                kq2Var.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                k22Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void i(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void j(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
