package defpackage;

import com.google.firebase.encoders.EncodingException;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class st1 implements ns0<st1> {
    public static final ot1 e = new kq2() { // from class: ot1
        @Override // defpackage.ms0
        public final void a(Object obj, lq2 lq2Var) {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    };
    public static final pt1 f = new fg5() { // from class: pt1
        @Override // defpackage.ms0
        public final void a(Object obj, gg5 gg5Var) {
            gg5Var.b((String) obj);
        }
    };
    public static final qt1 g = new fg5() { // from class: qt1
        @Override // defpackage.ms0
        public final void a(Object obj, gg5 gg5Var) {
            gg5Var.c(((Boolean) obj).booleanValue());
        }
    };
    public static final QnHx h = new QnHx();
    public final HashMap a;
    public final HashMap b;
    public final ot1 c;
    public boolean d;

    public static final class QnHx implements fg5<Date> {
        public static final SimpleDateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        }

        @Override // defpackage.ms0
        public final void a(Object obj, gg5 gg5Var) {
            gg5Var.b(a.format((Date) obj));
        }
    }

    public st1() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final ns0 a(Class cls, kq2 kq2Var) {
        this.a.put(cls, kq2Var);
        this.b.remove(cls);
        return this;
    }
}
