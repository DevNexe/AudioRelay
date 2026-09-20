package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ol3 {
    public static String a(j91 j91Var) {
        String string = j91Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
