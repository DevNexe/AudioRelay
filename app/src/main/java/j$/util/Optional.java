package j$.util;

import defpackage.A$Y4;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Supplier;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    private Optional(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return AbstractC1514m.p(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public T get() {
        T t = (T) this.a;
        if (t != null) {
            return t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public void ifPresent(Consumer<? super T> consumer) {
        A$Y4 a$y4 = (Object) this.a;
        if (a$y4 != null) {
            consumer.accept(a$y4);
        }
    }

    public boolean isPresent() {
        return this.a != null;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        U uApply;
        function.getClass();
        if (isPresent() && (uApply = function.apply((Object) this.a)) != null) {
            return of(uApply);
        }
        return empty();
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public T orElseGet(Supplier<? extends T> supplier) {
        T t = (T) this.a;
        return t != null ? t : supplier.get();
    }

    public final String toString() {
        Object obj = this.a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
