package defpackage;

import android.accounts.AccountManager;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class nz5 extends sv6 {
    public long c;
    public String d;
    public AccountManager e;
    public Boolean f;
    public long g;

    public nz5(dq6 dq6Var) {
        super(dq6Var);
    }

    @Override // defpackage.sv6
    public final boolean f() {
        Calendar calendar = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.d = LPt6Fixed.a(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long i() {
        e();
        return this.g;
    }

    public final long j() {
        g();
        return this.c;
    }

    public final String k() {
        g();
        return this.d;
    }
}
