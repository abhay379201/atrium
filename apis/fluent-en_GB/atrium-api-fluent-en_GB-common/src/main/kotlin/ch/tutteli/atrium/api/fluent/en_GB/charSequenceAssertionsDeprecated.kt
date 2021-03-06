//TODO remove file with 1.0.0
@file:Suppress("DEPRECATION", "DeprecatedCallableAddReplaceWith")
@file:JvmMultifileClass
@file:JvmName("CharSequenceAssertionsKt")

package ch.tutteli.atrium.api.fluent.en_GB

import ch.tutteli.atrium.api.fluent.en_GB.creating.charsequence.contains.builders.NotCheckerOption
import ch.tutteli.atrium.api.fluent.en_GB.creating.charsequence.contains.builders.impl.NotCheckerOptionImpl
import ch.tutteli.atrium.creating.Expect
import ch.tutteli.atrium.domain.builders.ExpectImpl
import ch.tutteli.atrium.domain.creating.charsequence.contains.CharSequenceContains
import ch.tutteli.atrium.domain.creating.charsequence.contains.CharSequenceContains.Builder
import ch.tutteli.atrium.domain.creating.charsequence.contains.searchbehaviours.NoOpSearchBehaviour
import ch.tutteli.atrium.domain.creating.charsequence.contains.searchbehaviours.NotSearchBehaviour
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Creates a [CharSequenceContains.Builder] based on this [Expect] which allows to define
 * more sophisticated `contains` assertions.
 *
 * @return The newly created builder.
 */
@Deprecated("Only here to retain binary backward compatibility; will be removed with 1.0.0")
fun <T : CharSequence> getContains(expect: Expect<T>): Builder<T, NoOpSearchBehaviour> =
    ExpectImpl.charSequence.containsBuilder(expect)

/**
 * Creates a [CharSequenceContains.Builder] based on this [Expect] which allows to define
 * more sophisticated `contains not` assertions.
 *
 * @return The newly created builder.
 */
@Deprecated("Only here to retain binary backward compatibility; will be removed with 1.0.0")
fun <T : CharSequence> getContainsNot(expect: Expect<T>): NotCheckerOption<T, NotSearchBehaviour> =
    NotCheckerOptionImpl(ExpectImpl.charSequence.containsNotBuilder(expect))
