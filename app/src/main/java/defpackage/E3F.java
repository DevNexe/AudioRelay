package defpackage;

import android.content.Context;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class E3F implements by1 {
    public final Context a;
    public final p32 b;
    public final lKy3 c;
    public final nj4 d = OW8.c(0, 1, null, 5);

    public E3F(Context context, p32 p32Var, lKy3 lky3) {
        this.a = context;
        this.b = p32Var;
        this.c = lky3;
    }

    @Override // defpackage.by1
    public final ay1 a() {
        return new ay1(d());
    }

    @Override // defpackage.by1
    public final void b(zx1 zx1Var) {
        boolean zA = ur1.a(zx1Var, zx1.CQf.a);
        Context context = this.a;
        p32 p32Var = this.b;
        if (zA) {
            p32Var.b.b(true);
            Locale locale = p32Var.a;
            p32Var.b.c(locale);
            p32Var.c.getClass();
            he5.a(context, locale);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != context) {
                he5.a(applicationContext, locale);
            }
        } else if (zx1Var instanceof zx1.QnHx) {
            Locale locale2 = ((zx1.QnHx) zx1Var).a.d;
            g52 g52Var = p32Var.b;
            g52Var.b(false);
            g52Var.c(locale2);
            p32Var.c.getClass();
            he5.a(context, locale2);
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != context) {
                he5.a(applicationContext2, locale2);
            }
        }
        this.c.g("LANG_PREF", true);
        this.d.e(sd5.a);
    }

    @Override // defpackage.by1
    public final zx1 c() {
        if (!this.c.c("LANG_PREF", false)) {
            return zx1.CQf.a;
        }
        p32 p32Var = this.b;
        if (p32Var.b.a()) {
            return zx1.CQf.a;
        }
        Locale localeD = p32Var.b.d();
        return new zx1.QnHx(new gx1(localeD.toLanguageTag(), localeD.getDisplayName(Locale.ENGLISH), localeD.getDisplayName(localeD)));
    }

    public final wz0 d() {
        return new wz0(new luCz(this, null), new X4d(this.d, this));
    }
}
