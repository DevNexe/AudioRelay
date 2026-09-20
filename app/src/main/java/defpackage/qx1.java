package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class qx1 extends cx1 implements j81<lx1, lx1> {
    public final /* synthetic */ rx1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qx1(rx1 rx1Var) {
        super(1);
        this.w = rx1Var;
    }

    @Override // defpackage.j81
    public final lx1 invoke(lx1 lx1Var) {
        List<Locale> listM = ps0.M(Locale.ENGLISH, Locale.FRENCH, Locale.forLanguageTag("zh-CN"), Locale.forLanguageTag("zh-TW"), Locale.forLanguageTag("de"), Locale.forLanguageTag("hu"), Locale.forLanguageTag("ja"), Locale.forLanguageTag("ko"), Locale.forLanguageTag("fa"), Locale.forLanguageTag("pl"), Locale.forLanguageTag("pt-BR"), Locale.forLanguageTag("ro"), Locale.forLanguageTag("ru"), Locale.forLanguageTag("es"), Locale.forLanguageTag("tr"), Locale.forLanguageTag("nn"), Locale.forLanguageTag("ar"), Locale.forLanguageTag("it"), Locale.forLanguageTag("in"), Locale.forLanguageTag("sk"), Locale.forLanguageTag("th"), Locale.forLanguageTag("vi"), Locale.forLanguageTag("uk"));
        ArrayList arrayList = new ArrayList(mu.w0(listM, 10));
        for (Locale locale : listM) {
            arrayList.add(new gx1(locale.toLanguageTag(), locale.getDisplayName(Locale.ENGLISH), locale.getDisplayName(locale)));
        }
        return new lx1(new kj1(wu.Z0(arrayList, new hx1())), this.w.a.c());
    }
}
