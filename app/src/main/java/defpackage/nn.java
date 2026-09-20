package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nn extends cx1 implements j81<Map.Entry<String, Object>, Map.Entry<rn, Object>> {
    public static final nn w = new nn();

    public nn() {
        super(1);
    }

    @Override // defpackage.j81
    public final Map.Entry<rn, Object> invoke(Map.Entry<String, Object> entry) {
        Map.Entry<String, Object> entry2 = entry;
        return new ot0(new rn(entry2.getKey()), entry2.getValue());
    }
}
