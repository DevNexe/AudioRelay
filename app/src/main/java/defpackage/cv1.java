package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class cv1 implements lq2, gg5 {
    public boolean a = true;
    public final JsonWriter b;
    public final Map<Class<?>, kq2<?>> c;
    public final Map<Class<?>, fg5<?>> d;
    public final kq2<Object> e;
    public final boolean f;

    public cv1(Writer writer, HashMap map, HashMap map2, ot1 ot1Var, boolean z) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = ot1Var;
        this.f = z;
    }

    @Override // defpackage.lq2
    public final lq2 a(yw0 yw0Var, Object obj) {
        return h(obj, yw0Var.a);
    }

    @Override // defpackage.gg5
    public final gg5 b(String str) throws IOException {
        i();
        this.b.value(str);
        return this;
    }

    @Override // defpackage.gg5
    public final gg5 c(boolean z) throws IOException {
        i();
        this.b.value(z);
        return this;
    }

    @Override // defpackage.lq2
    public final lq2 d(yw0 yw0Var, boolean z) throws IOException {
        String str = yw0Var.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.lq2
    public final lq2 e(yw0 yw0Var, int i) throws IOException {
        String str = yw0Var.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.lq2
    public final lq2 f(yw0 yw0Var, long j) throws IOException {
        String str = yw0Var.a;
        i();
        JsonWriter jsonWriter = this.b;
        jsonWriter.name(str);
        i();
        jsonWriter.value(j);
        return this;
    }

    public final cv1 g(Object obj) throws IOException {
        JsonWriter jsonWriter = this.b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            kq2<?> kq2Var = this.c.get(obj.getClass());
            if (kq2Var != null) {
                jsonWriter.beginObject();
                kq2Var.a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            fg5<?> fg5Var = this.d.get(obj.getClass());
            if (fg5Var != null) {
                fg5Var.a(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                i();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.e.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            i();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                i();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                g(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                g(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    public final cv1 h(Object obj, String str) throws IOException {
        boolean z = this.f;
        JsonWriter jsonWriter = this.b;
        if (z) {
            if (obj == null) {
                return this;
            }
            i();
            jsonWriter.name(str);
            return g(obj);
        }
        i();
        jsonWriter.name(str);
        if (obj != null) {
            return g(obj);
        }
        jsonWriter.nullValue();
        return this;
    }

    public final void i() {
        if (!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
