package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class XX implements d53 {
    public final Locale a;

    public XX(Locale locale) {
        this.a = locale;
    }

    @Override // defpackage.d53
    public final String a() {
        return this.a.toLanguageTag();
    }
}
