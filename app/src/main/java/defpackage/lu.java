package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lu {
    public static final boolean a;

    static {
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        a = property != null ? Boolean.parseBoolean(property) : false;
    }
}
