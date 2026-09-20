package j$.util;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/* JADX INFO: renamed from: j$.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1509h {
    public static Optional a(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.of(optional.get()) : Optional.empty();
    }

    public static C1510i b(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C1510i.d(optionalDouble.getAsDouble()) : C1510i.a();
    }

    public static C1511j c(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C1511j.d(optionalInt.getAsInt()) : C1511j.a();
    }

    public static C1512k d(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C1512k.d(optionalLong.getAsLong()) : C1512k.a();
    }

    public static java.util.Optional e(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? java.util.Optional.of(optional.get()) : java.util.Optional.empty();
    }

    public static OptionalDouble f(C1510i c1510i) {
        if (c1510i == null) {
            return null;
        }
        return c1510i.c() ? OptionalDouble.of(c1510i.b()) : OptionalDouble.empty();
    }

    public static OptionalInt g(C1511j c1511j) {
        if (c1511j == null) {
            return null;
        }
        return c1511j.c() ? OptionalInt.of(c1511j.b()) : OptionalInt.empty();
    }

    public static OptionalLong h(C1512k c1512k) {
        if (c1512k == null) {
            return null;
        }
        return c1512k.c() ? OptionalLong.of(c1512k.b()) : OptionalLong.empty();
    }
}
