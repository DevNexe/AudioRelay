package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class r32 extends cx1 implements j81<Configuration, sd5> {
    public final /* synthetic */ p32 w;
    public final /* synthetic */ Application x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r32(p32 p32Var, Application application) {
        super(1);
        this.w = p32Var;
        this.x = application;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Configuration configuration) {
        Configuration configuration2 = configuration;
        p32 p32Var = this.w;
        p32Var.getClass();
        p32Var.a = Build.VERSION.SDK_INT >= 24 ? configuration2.getLocales().get(0) : configuration2.locale;
        g52 g52Var = p32Var.b;
        boolean zA = g52Var.a();
        he5 he5Var = p32Var.c;
        Context context = this.x;
        if (zA) {
            Locale locale = p32Var.a;
            g52Var.c(locale);
            he5Var.getClass();
            he5.a(context, locale);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != context) {
                he5.a(applicationContext, locale);
            }
        } else {
            Locale localeD = g52Var.d();
            he5Var.getClass();
            he5.a(context, localeD);
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != context) {
                he5.a(applicationContext2, localeD);
            }
        }
        return sd5.a;
    }
}
