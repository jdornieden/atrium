package ch.tutteli.atrium.logic.creating.iterablelike.contains.searchbehaviours

import ch.tutteli.atrium.logic.creating.iterablelike.contains.IterableLikeContains
import ch.tutteli.atrium.logic.impl.creating.iterablelike.contains.searchbehaviours.InOrderOnlySearchBehaviourImpl

/**
 * Represents the search behaviour that expected entries have to appear in the given order within the [Iterable] and
 * that the resulting assertion should not hold if there are less or more entries than expected.
 */
interface InOrderOnlySearchBehaviour : IterableLikeContains.SearchBehaviour {
    companion object {
        operator fun invoke(): InOrderOnlySearchBehaviour =
            InOrderOnlySearchBehaviourImpl()
    }
}