package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class pa5 {
    public static final List<na5> a;

    public static final class CQf<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String str = ((na5) t).a.b;
            Locale locale = Locale.ROOT;
            return OW8.m(str.toUpperCase(locale), ((na5) t2).a.b.toUpperCase(locale));
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            pa5.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    static {
        List<na5> listM = ps0.M(new na5(gx1.QnHx.a("th"), Collections.singletonList("Chawalwit Akarajirathanachot")), new na5(gx1.QnHx.a("pl"), Collections.singletonList("RikoDEV")), new na5(gx1.QnHx.a("vi"), Collections.singletonList("Truong Minh Duc")), new na5(gx1.QnHx.a("tr"), ps0.M("Ahmet Deniz Dundar", "Yasin")), new na5(gx1.QnHx.a("sk"), ps0.M("Denis Steranka", "Quartyn")), new na5(gx1.QnHx.a("it"), ps0.M("Melchiorre Francesco Vicari", "SimoneSolda")), new na5(gx1.QnHx.a("ro"), Collections.singletonList("Eduard I.P.")), new na5(gx1.QnHx.a("de"), ps0.M("Dunss", "FJq3PQnFw", "tudelu")), new na5(gx1.QnHx.a("pt-BR"), ps0.M("Darkton Hallison", "Luis", "Luigi Minardi", "Ueslen A Navarro", "Kotakoro")), new na5(gx1.QnHx.a("fa"), ps0.M("saeed kavand", "TheExac")), new na5(gx1.QnHx.a("ru"), ps0.M("Nicky f.", "Ярослав Вязьмитин", "Maxim Mudryi")), new na5(gx1.QnHx.a("ja"), ps0.M("Takaki Lekura", "とぅめいぐぉぅ", "Kotakoro")), new na5(gx1.QnHx.a("ko"), ps0.M("Kimjunseo", "손승규")), new na5(gx1.QnHx.a("in"), ps0.M("nawka12", "amongthelines", "Marwan Rahman", "Oxyde")), new na5(gx1.QnHx.a("nl"), Collections.singletonList("caspervoges")), new na5(gx1.QnHx.a("es"), ps0.M("jkd45054", "pororoca2018", "Agustín")), new na5(gx1.QnHx.a("bg"), Collections.singletonList("marsi88")), new na5(gx1.QnHx.a("ms"), Collections.singletonList("MNH48")), new na5(gx1.QnHx.a("hu"), ps0.M("Skelly001", "yashratnaparkhi99", "IrepY")), new na5(gx1.QnHx.a("ar"), Collections.singletonList("msobhi412")), new na5(gx1.QnHx.a("sl"), Collections.singletonList("sasoD")), new na5(gx1.QnHx.a("uk"), Collections.singletonList("karmicbeast.ua")), new na5(gx1.QnHx.a("zh-TW"), ps0.M("Manboy Huang", "ultrachangfen")), new na5(gx1.QnHx.a("zh-CN"), ps0.M("Hana Shirosaki", "2799053433", "ZzzzzzzSkyward", "Howard Wu")), new na5(gx1.QnHx.a("nn"), Collections.singletonList("Monica Pinnedyr Jansen")), new na5(gx1.QnHx.a("ar"), Collections.singletonList("MohamedHojiry")));
        ArrayList arrayList = new ArrayList(mu.w0(listM, 10));
        for (na5 na5Var : listM) {
            arrayList.add(new na5(na5Var.a, wu.Y0(na5Var.b)));
        }
        a = wu.Z0(arrayList, new CQf());
    }

    public static final void a(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1105567037);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            n64.a(null, 0, u20.a, j30VarQ, 384, 3);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(i);
    }
}
